package com.ubaid.app.config.neo4jConfig;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Neo4jSessionFactory2X
{
	private final static SessionFactory sessionFactory = new SessionFactory("com.ubaid.entity");
	
	public Neo4jSessionFactory2X()
	{
	}
	
	@Bean
	public Session getSession()
	{
		return sessionFactory.openSession();
	}
}
