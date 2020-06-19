/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.bonsai.simulatorapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Unregister model.
 */
public class Unregister {
    /**
     * Possible values include: 'Unspecified', 'Finished', 'Error', 'NotFound'.
     */
    @JsonProperty(value = "reason")
    private UnregisterTypesReason reason;

    /**
     * The details property.
     */
    @JsonProperty(value = "details")
    private String details;

    /**
     * Get possible values include: 'Unspecified', 'Finished', 'Error', 'NotFound'.
     *
     * @return the reason value
     */
    public UnregisterTypesReason reason() {
        return this.reason;
    }

    /**
     * Set possible values include: 'Unspecified', 'Finished', 'Error', 'NotFound'.
     *
     * @param reason the reason value to set
     * @return the Unregister object itself.
     */
    public Unregister withReason(UnregisterTypesReason reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the details value.
     *
     * @return the details value
     */
    public String details() {
        return this.details;
    }

    /**
     * Set the details value.
     *
     * @param details the details value to set
     * @return the Unregister object itself.
     */
    public Unregister withDetails(String details) {
        this.details = details;
        return this;
    }

}
