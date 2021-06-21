package com.picture.repository.impl;

import com.picture.entity.Comment;
import com.picture.repository.CommentRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class CommentRepositoryImpl implements CommentRepository {

    @Override
    public List<Comment> showAllComment() {
        TypedQuery<Comment> typedQuery=ConnectionDB.entityManager.createQuery("select cm from comment cm",Comment.class);
        return typedQuery.getResultList();
    }

    @Override
    public Comment addComment(Comment comment) {
        Session session = null;
        Transaction transaction = null;

        session =ConnectionDB.sessionFactory.openSession();
        transaction = session.beginTransaction();

        Comment origin = new Comment();
        origin.setContent(comment.getContent());
        origin.setAuthor(comment.getAuthor());
        origin.setPoint("+ " + comment.getPoint());

        session.save(origin);
        transaction.commit();
        return origin;
    }
    @Override
    public void addLike(Comment comment) {
        Session session = null;
        Transaction transaction = null;

        session = ConnectionDB.sessionFactory.openSession();
        transaction = session.beginTransaction();

        comment.setLikes(comment.getLikes() + 1);

        String queryStr = "update comment set likes=:newLike WHERE id=:id";
        Query query = session.createQuery(queryStr);
        query.setParameter("newLike", comment.getLikes());
        query.setParameter("id", comment.getId());
        query.executeUpdate();

        transaction.commit();
        session.clear();
        session.close();

    }

    @Override
    public void disLike(Comment comment) {

        Session session = null;
        Transaction transaction = null;

        session = ConnectionDB.sessionFactory.openSession();
        transaction = session.beginTransaction();

        comment.setLikes(comment.getLikes() - 1);

        String queryStr = "update comment   set likes=:newLike WHERE id=:id";
        Query query = session.createQuery(queryStr);
        query.setParameter("newLike", comment.getLikes());
        query.setParameter("id", comment.getId());
        query.executeUpdate();

        transaction.commit();
        session.clear();
        session.close();
    }

    @Override
    public Comment findById(Integer id) {
        return ConnectionDB.entityManager.find(Comment.class, id);
    }
}
