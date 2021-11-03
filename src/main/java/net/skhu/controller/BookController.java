package net.skhu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.dto.Book;

@Controller
public class BookController {

    @GetMapping("book/edit")
    public String register2(Model model) {
        return "book/edit";
    }

    @PostMapping("book/edit")
    public String register2(Model model, HttpSession session, Book book)
    {
        String errorMsg = null;
        if (book.getBookid() == null || book.getBookid().length() == 0)
            errorMsg = "제목을 입력하세요";
        else if (book.getName() == null || book.getName().length() == 0)
            errorMsg = "저자을 입력하세요";
        else if (book.getMaker() == null || book.getMaker().length() == 0)
            errorMsg = "출판사를 입력하세요";
        else if (book.getDepartmentId() == 0)
            errorMsg = "종류를 선택하세요";
        else {
            session.setAttribute("book", book);
            return "redirect:edit_success";
        }
        model.addAttribute("book", book);
        model.addAttribute("errorMsg", errorMsg);
        return "book/edit";
    }

    @RequestMapping("book/edit_success")
    public String edit_success(Model model) {
        return "book/edit_success";
    }

}
