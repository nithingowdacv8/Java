package mock_29_req_1;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;

class Mobile {
    private String referenceId;
    private String modelName;
    private Double displaySize;
    private Double price;
    private java.util.Date launchedDate;

    public Mobile() {
        // Default constructor
    }

    public Mobile(String referenceId, String modelName, Double displaySize, Double price, String launchedDateStr) throws ParseException {
        this.referenceId = referenceId;
        this.modelName = modelName;
        this.displaySize = displaySize;
        this.price = price;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.launchedDate = dateFormat.parse(launchedDateStr);
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(Double displaySize) {
        this.displaySize = displaySize;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public java.util.Date getLaunchedDate() {
        return launchedDate;
    }

    public void setLaunchedDate(Date launchedDate) {
        this.launchedDate = launchedDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return "Reference Id: " + referenceId + "\nModel Name: " + modelName + "\nDisplay Size: " +
                String.format("%.1f", displaySize) + "\nPrice: " + String.format("%.1f", price) +
                "\nLaunched Date: " + dateFormat.format(launchedDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mobile mobile = (Mobile) o;
        return referenceId.equalsIgnoreCase(mobile.referenceId) &&
                modelName.equalsIgnoreCase(mobile.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referenceId, modelName);
    }
}