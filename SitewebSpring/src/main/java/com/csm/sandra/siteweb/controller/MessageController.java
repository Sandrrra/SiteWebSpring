package com.csm.sandra.siteweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.csm.sandra.siteweb.model.Message;

@Controller
public class MessageController {
      private List<Message> messageList = new ArrayList<>();
      @PostMapping("/msg")
      public String postMessage(@ModelAttribute Message newMessage) {
    	  messageList.add(newMessage);
    	  return "redirect:msg";
      }
	 @GetMapping("/msg")
	 public String showMessage(Model model){
		 
		 model.addAttribute("msglist",messageList);
		 model.addAttribute("newMessage", new Message());
		 
		 
		 return"MesgPage"; 
		 
		 
	 }
}
