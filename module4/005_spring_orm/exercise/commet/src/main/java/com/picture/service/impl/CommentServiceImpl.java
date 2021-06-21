package com.picture.service.impl;

import com.picture.entity.Comment;
import com.picture.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements ICommentService {
    @Autowired
    CommentRepository commentRepository;
    @Override
    public List<Comment> showAllComment() {
        return this.commentRepository.showAllComment();
    }

    @Override
    public Comment addComment(Comment comment) {
      return this.commentRepository.addComment(comment);
    }

    @Override
    public void addLike(Comment comment) {
        this.commentRepository.addLike(comment);

    }

    @Override
    public void disLike(Comment comment) {
        this.commentRepository.disLike(comment);

    }

    @Override
    public Comment findById(Integer id) {
        return this.commentRepository.findById(id);
    }
}
