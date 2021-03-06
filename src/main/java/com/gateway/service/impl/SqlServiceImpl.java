package com.gateway.service.impl;

import com.gateway.service.SqlService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Z
 */
@Service
public class SqlServiceImpl implements SqlService {


    @Override
    public String query(String table, List<String> cols){
        return "select "+cols.toString().substring(1,cols.toString().length()-1)+" from "+table;
    }

    @Override
    public String insertItem(String table, List<String> cols, List<String> params) {
        String column = cols.toString().substring(1,cols.toString().length()-1);
        params=params.stream().map(x->"\""+x+"\"").collect(Collectors.toList());
        String parameter = params.toString().substring(1,params.toString().length()-1);
        return "insert into "+table+"("+ column +") values ("+parameter+")";
    }
}
