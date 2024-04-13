package poly.manhnt.datn_md09.api;

import java.util.List;

import poly.manhnt.datn_md09.Models.ProductResponse;
import poly.manhnt.datn_md09.Models.model_login.LoginRequest;
import poly.manhnt.datn_md09.Models.model_login.LoginResponse;
import poly.manhnt.datn_md09.Models.model_register.RegisterRequest;
import poly.manhnt.datn_md09.Models.model_register.RegisterResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {

    @POST("userslogin")
    Call<LoginResponse> loginUser(@Body LoginRequest loginRequest);

    @POST("users")
    Call<RegisterResponse> registerUser(@Body RegisterRequest registerRequest);

    @GET("products/1")
    Call<List<ProductResponse>> getListProduct();
}
