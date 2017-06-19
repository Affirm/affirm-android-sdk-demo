package com.affirm.affirmsdk.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

@AutoValue public abstract class CheckoutResponse {
  @SerializedName("redirect_url") public abstract String redirectUrl();

  public static TypeAdapter<CheckoutResponse> typeAdapter(Gson gson) {
    return new AutoValue_CheckoutResponse.GsonTypeAdapter(gson);
  }

}