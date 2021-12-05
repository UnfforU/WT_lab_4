package by.unfforu.lab_4.query;

import java.util.List;

/**
 * Custom query interface
 */
public interface CustomQuery {
    /**
     * Get sql part
     *
     * @return String
     */
    String toSql();

    /**
     * Get parameters
     *
     * @return List<Object>
     */
    List<Object> getParameters();
}
