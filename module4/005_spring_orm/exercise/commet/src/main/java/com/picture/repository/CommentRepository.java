package com.picture.repository;

import com.picture.entity.Comment;

import java.util.List;

public interface CommentRepository {
    List<Comment> showAllComment();

    Comment addComment(Comment comment);

    void addLike(Comment comment);

    void disLike(Comment comment);

    Comment findById(Integer id);
}
