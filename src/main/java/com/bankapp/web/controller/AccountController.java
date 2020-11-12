package com.bankapp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.model.service.AccountService;

@Controller
public class AccountController {
	@Autowired
	private AccountService accountService;

	/*@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homeGet(AccountBean accountBean, ModelMap map) {
		map.addAttribute("accountBean", new AccountBean());

		return "home";
	}
*/
	@RequestMapping(value = "/accounts", method = RequestMethod.GET)
	public ModelAndView allaccounts(ModelAndView mv) {
		mv.addObject("accounts", accountService.getAllAccounts());
		mv.setViewName("allaccounts");
		
		return mv;
	}

	/*@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String homePost(AccountBean accountBean) {
		accountService.transfer(accountBean.getFrom(), accountBean.getTo(), accountBean.getAmount());
		return "success";
	}*/
/*
	@RequestMapping(value = "/addaccount", method = RequestMethod.GET)
	public String addaccountGet(ModelMap map) {
		map.addAttribute("account", new Account());
		return "addaccount";
	}
*/
	/*@RequestMapping(value = "/addaccount", method = RequestMethod.POST)
	public String addAccountUpdatePost(@Valid @ModelAttribute(value = "account") Account account,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "addaccount";
		} else {
			if (account.getId() == 0)
				accountService.add(account);
			else
				accountService.update(account);
			return "redirect:getallaccounts";
		}
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteAccount(HttpServletRequest req) {
		int accountNo = Integer.parseInt(req.getParameter("id"));
		accountService.deleteAccount(accountNo);
		return "redirect:allaccounts";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateAccountGet(HttpServletRequest req, ModelMap map) {
		int accountNo = Integer.parseInt(req.getParameter("id"));
		Account accountToBeUpdate = accountService.getAccountById(accountNo);
		map.addAttribute("account", accountToBeUpdate);
		return "addaccount";
	}
*/
	@RequestMapping(value = "/")
	public String first() {
		return "first";
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin() {
		return "admin";
	}

	@RequestMapping(value = "/mgr", method = RequestMethod.GET)
	public String mgr() {
		return "mgr";
	}

	@RequestMapping(value = "/clerk", method = RequestMethod.GET)
	public String clerk() {
		return "clerk";
	}

}
