
package com.ltc.richtext.util;

import java.util.List;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.util.Pair;

public class RichTextUtil {

    public static SpannableStringBuilder getSpannableString(List<Pair<String, SpanList>> list) {
        if (list == null || list.size() == 0) {
            return null;
        }

        SpannableStringBuilder ssb = new SpannableStringBuilder();

        int position = 0;
        for (Pair<String, SpanList> pair : list) {
            int len = pair.first.length();
            ssb.append(pair.first);

            if(pair.second != null) {
                for (Object object : pair.second.getSpanList()) {
                    ssb.setSpan(object, position, position + len, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                }
            }

            position += len;
        }

        return ssb;
    }
}
