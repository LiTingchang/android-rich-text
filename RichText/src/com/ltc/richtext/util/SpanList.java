package com.ltc.richtext.util;

import java.util.ArrayList;
import java.util.List;

public class SpanList {
    
    private List<Object> spanList;
    
    public SpanList() {
        spanList = new ArrayList<Object>();
    }
    
    public SpanList appendSpan(Object object) {
        spanList.add(object);
        return this;
    }
    
    public List<Object> getSpanList() {
        return spanList;
    }
}
