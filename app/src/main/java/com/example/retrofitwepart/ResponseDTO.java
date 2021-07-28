package com.example.retrofitwepart;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

//@Generated("com.robohorse.robopojogenerator")
public class ResponseDTO implements Serializable {

	@SerializedName("data")
	private DataDTO data;

	@SerializedName("success")
	private boolean success;

	@SerializedName("status")
	private int status;

	public DataDTO getData(){
		return data;
	}

	public boolean isSuccess(){
		return success;
	}

	public int getStatus(){
		return status;
	}
}