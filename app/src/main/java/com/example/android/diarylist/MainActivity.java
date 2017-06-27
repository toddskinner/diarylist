package com.example.android.diarylist;

import android.icu.util.Calendar;
import android.icu.util.GregorianCalendar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference mDatabase;
    private DatabaseReference journalCloudEndPoint;
    private DatabaseReference tagCloudEndPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        journalCloudEndPoint = mDatabase.child("journalentries");
        tagCloudEndPoint = mDatabase.child("tags");

        journalCloudEndPoint.setValue("Hello World");
    }

    public static List<JournalEntry> getSampleJournalEntries(){
        List<JournalEntry> journalEntries = new ArrayList<>();
        //create the dummy journal
        JournalEntry journalEntry1 = new JournalEntry();
        journalEntry1.setTitle("DisneyLand Trip");
        journalEntry1.setContent("We went to DisneyLand today and the kids had lots of fun!");
        Calendar calendar1 = GregorianCalendar.getInstance();
        journalEntry1.setDateModified(calendar1.getTimeInMillis());
        journalEntries.add(journalEntry1);
        return journalEntries;
    }

    private void addInitialDataToFirebase(){
        List<JournalEntry> sampleJournalEntries = SampleData.
    }
}
