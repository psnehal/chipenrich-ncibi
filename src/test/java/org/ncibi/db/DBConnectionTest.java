package org.ncibi.db;

import org.hibernate.Session;
import org.junit.Test;
import org.ncibi.hibernate.SessionProcedure;
import org.ncibi.hibernate.Sessions;

public class DBConnectionTest {
	
	private static final PersistenceSession wsPersistence = new PersistenceUnit(
            EntityManagers.newEntityManagerFromProject("task"));

	@Test
	public void test() {
		Sessions.withSession(wsPersistence.session(), new SessionProcedure(){

			@Override
			public void apply(Session session) {
				String sql = "select * from Queue";
				session.createSQLQuery(sql).list();		
			}});
	}

}
