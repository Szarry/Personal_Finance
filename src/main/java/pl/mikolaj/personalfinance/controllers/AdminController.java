package pl.mikolaj.personalfinance.controllers;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.mikolaj.personalfinance.DAO.User.AppUser;
import pl.mikolaj.personalfinance.DAO.User.CurrentUser;
import pl.mikolaj.personalfinance.DAO.budget.Budget;
import pl.mikolaj.personalfinance.DAO.income.Income;
import pl.mikolaj.personalfinance.DAO.income.IncomeRepository;
import pl.mikolaj.personalfinance.DAO.budget.BudgetRepository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.Valid;
import java.text.Normalizer;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;


@Controller
@RequestMapping("/admin")
public class AdminController {

    private final IncomeRepository incomeRepository;
    private final BudgetRepository budgetRepository;

    public AdminController(IncomeRepository incomeRepository, BudgetRepository budgetRepository) {
        this.incomeRepository = incomeRepository;
        this.budgetRepository = budgetRepository;
    }

    @ModelAttribute("incomeCategories")
    public List<String> incomeCategories() {
        List<String> typeOfIncome = new ArrayList<>();
        typeOfIncome.add("Zlecenie");
        typeOfIncome.add("Fucha");
        typeOfIncome.add("Odsetki bankowe");
        return typeOfIncome;
    }

    @ModelAttribute("months")
    public List<Integer> months() {
        List<Integer> months = new ArrayList<>();
        months.add(1);
        months.add(2);
        months.add(3);
        months.add(4);
        months.add(5);
        months.add(6);
        months.add(7);
        months.add(8);
        months.add(9);
        months.add(10);
        months.add(11);
        months.add(12);
    return months;
    }


    // Main admin page mapping
    @GetMapping("/")
    public String home(Model model) {

        return "admin/index";
    }

    @PostMapping("/")
    public String logout() {

        return "redirect:/";
    }


    // Add Income mapping //
    @GetMapping("/incomeAdd")
    public String incomeAdd(Model model) {
        model.addAttribute("income", new Income());
        return "admin/incomeAdd";
    }

    @PostMapping("/incomeAdd")
    public String saveIncome(@Valid Income income, BindingResult result, @AuthenticationPrincipal CurrentUser customUser) {

        if (result.hasErrors()) {
            return "admin/incomeAdd";
        } else {
            LocalDateTime ldt = LocalDateTime.now();
            AppUser entityUser = customUser.getAppUser();
            income.setUser(entityUser);
            income.setDate(ldt);
            incomeRepository.save(income);
        }
        return "redirect:/admin/incomeList";
    }


    // Edit Income mapping //
    @GetMapping("/incomeEdit/{incomeId}")
    public String incomeEdit(Model model, @PathVariable int incomeId) {
        Income incomeById = incomeRepository.findById(incomeId);
        model.addAttribute("income", incomeById);
        return "admin/incomeEdit";
    }

    @PostMapping("/incomeEdit/{incomeId}")
    public String performIncomeEdit(@Valid Income income, BindingResult result, @AuthenticationPrincipal CurrentUser customUser,
                                    @PathVariable int incomeId) {

        if (result.hasErrors()) {
            return "admin/incomeEdit";
        } else {
            AppUser entityUser = customUser.getAppUser();
//
            Income incomeNotChanged = incomeRepository.findById(incomeId);
            income.setDate(incomeNotChanged.getDate());
            income.setUser(incomeNotChanged.getUser());
            income.setId(incomeNotChanged.getId());
            income.setUpdatedBy(entityUser.getUsername());
            incomeRepository.save(income);
        }
        return "redirect:/admin/incomeList";
    }

    // List Income mapping //
    @GetMapping("/incomeList")
    public String incomeList(Model model) {
        List<Income> allIncomes = incomeRepository.findAll();
        model.addAttribute("incomeList", allIncomes);
        return "admin/incomeList";
    }




    @GetMapping("/incomeDelete/{incomeId}")
        public String incomeDelete(){

        return "admin/incomeDelete";
        }
    @PostMapping ("/incomeDelete/{incomeId}")
    public String performIncomeDelete(@RequestParam int Id){


        return "redirect:/admin/incomeList";
    }

    // Add Budget mapping //
    @GetMapping("/budgetAdd")
    public String budgetAdd(Model model) {
        model.addAttribute("budget", new Budget());
        return "admin/budgetAdd";
    }

    @PostMapping("/budgetAdd")
    public String performBudgetAdd(@Valid Budget budget, BindingResult result) {

        if (result.hasErrors()) {
            return "admin/budgetAdd";
        } else {
            LocalDateTime localDateTime = LocalDateTime.now();
            budget.setDate_Time(localDateTime);
            budgetRepository.save(budget);
        }
        return "redirect:/admin/";
    }

    // EditBudget mapping //
    @GetMapping("/budgetEdit")
    public String budgetEdit(Model model) {
        model.addAttribute("budget", new Budget());
//        Budget budget1 =
        return "admin/budgetAdd";
    }

    @PostMapping("/budgetEdit")
    public String performBudgetEdit(@Valid Budget budget, BindingResult result) {

        if (result.hasErrors()) {
            return "admin/budgetAdd";
        } else {
            LocalDateTime localDateTime = LocalDateTime.now();
            budget.setDate_Time(localDateTime);
            budgetRepository.save(budget);
        }
        return "redirect:/admin/";
    }


}
