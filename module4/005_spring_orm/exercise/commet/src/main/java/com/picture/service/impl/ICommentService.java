package com.picture.service.impl;

import com.picture.entity.Comment;

import java.util.List;

public interface ICommentService {

    List<Comment> showAllComment();

    Comment addComment(Comment comment);

    void addLike(Comment comment);

    void disLike(Comment comment);

    Comment findById(Integer id);
}
