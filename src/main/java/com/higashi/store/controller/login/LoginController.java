package com.higashi.store.controller.login;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.higashi.store.Form.LoginForm;

@Controller
public class LoginController {

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index(Model model) {

		return "index";
	}

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String login(@ModelAttribute LoginForm form, HttpSession session) {

		// セッション情報を無効にする
		session.invalidate();

		return "login";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String doLogin(@ModelAttribute LoginForm form) {

		return "redirect:/";
	}

}
