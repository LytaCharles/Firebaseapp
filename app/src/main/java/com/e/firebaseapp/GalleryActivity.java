package com.e.firebaseapp;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class GalleryActivity extends AppCompatActivity {

    private CircleImageView imageProfile;
    private Button btchooseImage;
    private EditText enterName;
    private EditText phoneNumber;
    private EditText emailAdress;
    private Button submit;
    private final static int PICK_IMAGE_REQUEST =1;
    private Uri cImageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        CircleImageView imageProfile =(CircleImageView)findViewById(R.id.iv_imageprofile_id);
        Button btchooseImage = (Button)findViewById(R.id.bt_chooseimage);
        EditText enterName = (EditText)findViewById(R.id.et_entername_id);
        EditText phoneNumber = (EditText)findViewById(R.id.et_phonenumber_id);
        EditText emailAdress = (EditText)findViewById(R.id.et_emailadress_id);
       btchooseImage.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               takeImage();
           }
       });
    }
    // creating intent,action,result code.
    private void takeImage() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent,PICK_IMAGE_REQUEST);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null){
            cImageUri = data.getData();
            imageProfile.setImageURI(cImageUri);

        }
    }
}
