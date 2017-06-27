package com.example.android.diarylist;

/**
 * Created by toddskinner on 6/27/17.
 */

public class JournalEntry {
    private String journalId;
    private String title;
    private String content;
    private long dateCreated;
    private long dateModified;
    private String tagId;
    private String tagName;

    public JournalEntry() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDateModified(long dateModified) {
        this.dateModified = dateModified;
    }
}
