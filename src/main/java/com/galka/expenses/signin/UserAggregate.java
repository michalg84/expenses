package com.galka.expenses.signin;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
@Slf4j
@Getter
@Setter
public class UserAggregate {

    @AggregateIdentifier
    private Integer id;
    private String username;
    private String login;
    private String mail;
    private String password;

    @CommandHandler
    public UserAggregate(UserSignInCommand cmd) {
        log.info("AccountCreatedCommand received.");
        AggregateLifecycle.apply(new UserSignInEvent(cmd.getUsername(),
                cmd.getMail(),
                cmd.getPassword(),
                cmd.getConfirmPassword()));
    }

    @EventSourcingHandler
    public void on(UserSignInEvent event) {
        log.info("An UserSignInEvent occurred with: {}.", event);

//        AggregateLifecycle.apply(new AccountActivatedEvent(this.accountId, "ACTIVATED"));
    }
}
