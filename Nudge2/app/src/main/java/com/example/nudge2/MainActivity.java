package com.example.nudge2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        getAllCourses(db);
        addCourses(db);

    }

    private void getAllCourses(FirebaseFirestore db) {
        // [START get_all_users]
        db.collection("courses")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (DocumentSnapshot document : task.getResult()) {
                                Log.d("Courses", document.getId() + " => " + document.getData());
                                System.out.println(document.getId());
                                System.out.println(document.getData());
                            }
                        } else {
                            Log.w("courses", "Error getting documents.", task.getException());
                        }
                    }
                });

        // [END get_all_users]
    }

    private void addCourses(FirebaseFirestore db){
        Map<String, Object> user = new HashMap<>();
        user.put("answer", "This is the second answer");
        db.collection("courses").document("ECE 568").set(user);

//        db.collection("courses")
//                .add(user)
//                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
//                    @Override
//                    public void onSuccess(DocumentReference documentReference) {
//                        documentReference.set()
//                        Log.d("course", "DocumentSnapshot added with ID: " + documentReference.getId());
//                    }
//                })
//                .addOnFailureListener(new OnFailureListener() {
//                    @Override
//                    public void onFailure(@NonNull Exception e) {
//                        Log.w("course", "Error adding document", e);
//                    }
//                });
    }
}

