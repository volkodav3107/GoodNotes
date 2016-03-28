package com.example.vlad.goodnotes;

import java.util.Date;

/**
 * Created by Vlad on 28.03.2016.
 * Class of Note
 */
public class Note {

    private String mNameNote;
    private String mNoteText;
    private String mNoteImages[];
    private Date mNoteDateCreation;
    private Date mNoteDateChanged;


    public Note(String mNameNote, String mNoteText, String[] mNoteImages, Date mNoteDateCreation, Date mNoteDateChanged) {
        this.mNameNote = mNameNote;
        this.mNoteText = mNoteText;
        this.mNoteImages = mNoteImages;
        this.mNoteDateCreation = mNoteDateCreation;
        this.mNoteDateChanged = mNoteDateChanged;
    }

    public String getmNameNote() {
        return mNameNote;
    }


    public String getmNoteText() {
        return mNoteText;
    }

    public String[] getmNoteImages() {
        return mNoteImages;
    }

    public Date getmNoteDateCreation() {
        return mNoteDateCreation;
    }

    public Date getmNoteDateChanged() {
        return mNoteDateChanged;
    }
}
