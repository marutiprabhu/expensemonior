/**
 * 
 */
package expensemonitor_service.expensemonitor_service.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author PC
 *
 */
public class RestOutputVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5521253078281171714L;
	
	private Boolean validResult;
	private String status;
	private Object jsonObject;
	private List<?> jsonArray;

	public Boolean getValidResult() {
		return validResult;
	}

	public void setValidResult(Boolean validResult) {
		this.validResult = validResult;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getJsonObject() {
		return jsonObject;
	}

	public void setJsonObject(Object jsonObject) {
		this.jsonObject = jsonObject;
	}

	public List<?> getJsonArray() {
		return jsonArray;
	}

	public void setJsonArray(List<?> jsonArray) {
		this.jsonArray = jsonArray;
	}
	
	@Override
	public String toString() {
		return "RestOutputVo [validResult=" + validResult + ", status=" + status + ", jsonObject=" + jsonObject
				+ ", jsonArray=" + jsonArray + "]";
	}


}
