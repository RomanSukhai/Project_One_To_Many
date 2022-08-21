package ua.lviv.lgs.model.one_to_many;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Application {
	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		Post post = new Post();
		post.setTitle("blablabla");
		
		Comment comment1 = new Comment( "Roman", post);
		Comment comment2 = new Comment( "Roman", post);
		Comment comment3 = new Comment( "Roman", post);
		Comment comment4 = new Comment( "Roman", post);
		Set<Comment> comments = new HashSet<Comment>(Arrays.asList(comment1,comment2,comment3,comment4));
		
		post.setComment(comments);
		
		SessionFactory sessionFactory = null;
		
		sessionFactory = HibernateUTIL.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		Transaction tx = (Transaction) session.beginTransaction();
		
		 session.save(post);
		 
		 comments.forEach(e->session.save(e));
		 tx.commit();
		 session.close();
		 
		 
    }
}
