package org.fastgym.iam.domain.services;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.fastgym.iam.domain.model.aggregates.User;
import org.fastgym.iam.domain.model.commands.DeleteUserCommand;
import org.fastgym.iam.domain.model.commands.LogInCommand;
import org.fastgym.iam.domain.model.commands.SignUpCommand;
import org.fastgym.iam.domain.model.commands.UpdateUserCommand;

import java.util.Optional;

/**
 * User command service.
 * <p>
 *     This service is responsible for handling user aggregate commands.
 * </p>
 */
public interface UserCommandService {

    /**
     * Handle the sign-up command.
     * <p>
     *     This method is responsible for handling the sign-up command.
     * </p>
     * @param command The sign-up command.
     * @return The user aggregate.
     * @see SignUpCommand
     */
    Optional<User> handle(SignUpCommand command);

    /**
     * Handle the sign-in command.
     * <p>
     *     This method is responsible for handling the sign-in command.
     * </p>
     * @param command The sign-in command.
     * @return The user aggregate and the generated token.
     * @see LogInCommand
     */
    Optional<User> handle(LogInCommand command);

    /**
     * Handle the update user command.
     * <p>
     *     This method is responsible for handling the update user command.
     * </p>
     * @param command The update user command.
     * @return The updated user aggregate.
     * @see UpdateUserCommand
     */
    Optional<User> handle(UpdateUserCommand command);

    /**
     * Handle the delete user command.
     * <p>
     *     This method is responsible for handling the delete user command.
     * </p>
     * @param command The delete user command.
     * @return The deleted user aggregate.
     * @see DeleteUserCommand
     */
    Optional<User> handle(DeleteUserCommand command);
}