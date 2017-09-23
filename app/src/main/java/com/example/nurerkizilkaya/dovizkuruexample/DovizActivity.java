package com.example.nurerkizilkaya.dovizkuruexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.nurerkizilkaya.dovizkuruexample.model.Doviz;
import com.example.nurerkizilkaya.dovizkuruexample.webservice.DovizMethods;
import com.example.nurerkizilkaya.dovizkuruexample.webservice.DovizRetroClient;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DovizActivity extends AppCompatActivity {

    @Bind(R.id.dolarId)
    TextView  dolarId;
    @Bind(R.id.euroId)
    TextView euroId;
    @Bind(R.id.dateId)
    TextView dateId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doviz);
        ButterKnife.bind(this);
        getDovizFromApi();

    }
    public void getDovizFromApi()
    {
        final DovizMethods dovizApi = DovizRetroClient.getClient().create(DovizMethods.class);
        final Call<Doviz> call = dovizApi.getDoviz();

        call.enqueue(new Callback<Doviz>() {
            @Override
            public void onResponse(Call<Doviz> call, Response<Doviz> response) {
                dolarId.setText(response.body().getDolar().toString());
                euroId.setText(response.body().getEuro().toString());
                dateId.setText(response.body().getSonkayit().toString());
            }
            @Override
            public void onFailure(Call<Doviz> call, Throwable t) {

            }
        });
    }
}
