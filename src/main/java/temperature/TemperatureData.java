package temperature;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TemperatureData {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String sensorName;
    private BigDecimal value;
    private Timestamp time;
    
    public TemperatureData () {
    	
    }
    
    public TemperatureData (String sensorName, BigDecimal value, Timestamp time) {
    	this.sensorName = sensorName;
    	this.value = value;
    	this.time = time;
    }
    
	public String getSensorName() {
		return sensorName;
	}
	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}

}
