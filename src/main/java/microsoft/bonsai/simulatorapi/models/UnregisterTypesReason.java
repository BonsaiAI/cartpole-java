/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.bonsai.simulatorapi.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for UnregisterTypesReason.
 */
public enum UnregisterTypesReason {
    /** Enum value Unspecified. */
    UNSPECIFIED("Unspecified"),

    /** Enum value Finished. */
    FINISHED("Finished"),

    /** Enum value Error. */
    ERROR("Error"),

    /** Enum value NotFound. */
    NOT_FOUND("NotFound");

    /** The actual serialized value for a UnregisterTypesReason instance. */
    private String value;

    UnregisterTypesReason(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a UnregisterTypesReason instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed UnregisterTypesReason object, or null if unable to parse.
     */
    @JsonCreator
    public static UnregisterTypesReason fromString(String value) {
        UnregisterTypesReason[] items = UnregisterTypesReason.values();
        for (UnregisterTypesReason item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}