package by.unfforu.lab_4.controller.command.common;

import by.unfforu.lab_4.controller.command.Command;
import by.unfforu.lab_4.controller.command.CommandResult;
import by.unfforu.lab_4.exception.CustomException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Start login command class
 */
public class StartLoginCommand implements Command {
    /**
     * Page path
     */
    private static final String LOGIN_PAGE = "/WEB-INF/pages/login.jsp";

    /**
     * Execute command
     *
     * @param request request
     * @param response response
     *
     * @return CommandResult
     *
     * @throws CustomException
     */
    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws CustomException {
        return CommandResult.forward(LOGIN_PAGE);
    }
}
