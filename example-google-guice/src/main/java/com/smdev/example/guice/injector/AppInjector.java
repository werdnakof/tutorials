package com.smdev.example.guice.injector;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.smdev.example.guice.services.BackupService;
import com.smdev.example.guice.services.MessageService;
import com.smdev.example.guice.services.impl.FileSystemBackupService;
import com.smdev.example.guice.services.impl.MailService;

public class AppInjector extends AbstractModule {

	@Override
	protected void configure() {
		
		/*
		 * Linked binding -> maps a type to its implementation
		 * 
		 * In this case we will use only one implementation at a time. Linked
		 * bindings can also be chained.
		 */
		bind(BackupService.class).to(FileSystemBackupService.class);

		/*
		 * Linked binding -> maps a type to its implementation
		 * 
		 * In this case we will use only one implementation at a time. Linked
		 * bindings can also be chained.
		 */
		bind(MessageService.class).to(MailService.class);

		/*
		 * Instance binding -> binds a type to a specific instance
		 * 
		 * Avoid using .toInstance with objects that are complicated to create,
		 * since it can slow down application startup. You can use an @Provides
		 * method instead.
		 */
		bind(Integer.class).annotatedWith(Names.named("MAX_RETRY_ATTEMPTS")).toInstance(10);
	}

}
