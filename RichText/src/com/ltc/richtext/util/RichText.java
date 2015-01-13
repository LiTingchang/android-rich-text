package com.ltc.richtext.util;

import java.util.ArrayList;
import java.util.List;

import android.text.SpannableStringBuilder;
import android.util.Pair;

public class RichText {

    private List<Pair<String, SpanList>> richTextRes;
    
    public RichText() {
        richTextRes = new ArrayList<Pair<String, SpanList>>();
    }
    
    public RichText append(String text, SpanList spanList) {
        richTextRes.add(new Pair<String, SpanList>(text, spanList));
        return this;
    }
    
    public SpannableStringBuilder toSpannableString() {
        return RichTextUtil.getSpannableString(richTextRes);
    }
    
}
