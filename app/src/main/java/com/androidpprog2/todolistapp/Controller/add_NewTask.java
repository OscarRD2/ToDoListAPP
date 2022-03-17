package com.androidpprog2.todolistapp.Controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.androidpprog2.todolistapp.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class add_NewTask extends BottomSheetDialogFragment {

    public static final String TAG = "AddNewTask";

    private EditText mEditText;
    private Button mSaveButton;

    public static add_NewTask newInstance(){
        return new add_NewTask();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.add_newtask , container , false);
        return v;
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mEditText = view.findViewById(R.id.edittext);
        mSaveButton = view.findViewById(R.id.button_save);
        boolean isUpdate = false;







        final boolean finalIsUpdate = isUpdate;

        mSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String titulo = mEditText.getText().toString();

                if (finalIsUpdate) {

                } else {
                    //Añadir a la lista

                }

            }
        });
    }



}
