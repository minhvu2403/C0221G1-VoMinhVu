package com.picture.controller;

import com.picture.entity.Comment;
import com.picture.service.impl.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = {"/comment","/"})
public class CommentController {
    @Autowired
    private ICommentService commentService;
    @GetMapping({"","/list"})
    public ModelAndView goComment(){
        ModelAndView modelAndView =new ModelAndView("../views/comment");
        List<Comment> commentList=this.commentService.showAllComment();
        modelAndView.addObject("listComment",commentList);
        return modelAndView;
    }

    @GetMapping("/saveComment")
    public String addComment(@ModelAttribute Comment comment){
        this.commentService.addComment(comment);
        return "redirect:/comment/list";
    }
    @GetMapping("/likeComment/{id}")
    public String like(@PathVariable Integer id){
        Comment comment=commentService.findById(id);
        this.commentService.addLike(comment);
        return "redirect:/comment/list";

    }
    @GetMapping("/dislikeComment/{id}")
    public String dislike(@PathVariable Integer id){
        Comment comment=commentService.findById(id);
        this.commentService.disLike(comment);
        return "redirect:/comment/list";
    }

}
