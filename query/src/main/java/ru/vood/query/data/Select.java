package ru.vood.query.data;

import lombok.Builder;

@Builder
public class Select {
    private String select;
    private From from;
    private Join join;
    private LeftJoin leftJoin;
    private RightJoin rightJoin;
    private Where where;
}
