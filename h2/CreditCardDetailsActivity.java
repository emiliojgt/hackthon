package com.h2.h2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.braintreepayments.cardform.view.CardForm;

import butterknife.ButterKnife;

/**
 * Created by emiliojose on 24/2/19.
 */

public class CreditCardDetailsActivity extends AppCompatActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_credit_card);
        CardForm cardForm = (CardForm) findViewById(R.id.card_form);
        cardForm.cardRequired(true)
                .cardRequired(true)
                .expirationRequired(true)
                .cvvRequired(true)
                //.cardholderName(CardForm.FIELD_REQUIRED)
                //.postalCodeRequired(true)
                //.mobileNumberRequired(true)
                //.mobileNumberExplanation("SMS is required on this number")
                //.actionLabel("Purchase")
                .setup(this);
    }
}
