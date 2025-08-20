package dev.centremetre.model;

/**
 * Designed to represent a column from a database, including its type and other metadata.
 */
public class Column
{
    // Basic Identification
    private String name;

    private String type;

    private Integer size;

    private boolean isNullable;

    // Constraints
    private boolean isPrimaryKey;

    private boolean isUnique;

    private boolean isForeignKey;

    private String defaultValue;

    private boolean isAutoIncrementing;
}
