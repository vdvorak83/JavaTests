package com.JavaTests.model.impl;

import com.JavaTests.dao.impl.BasicDaoImpl;
import com.JavaTests.model.TopicModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.sql.*;

@Component
public class TopicModelImpl implements TopicModel {

    private String name;
    private String description;

    @Autowired
    BasicDaoImpl basicDaoImpl;

    public TopicModelImpl() {
    }

//    public static void init() throws ClassNotFoundException {
//        Class.forName("com.mysql.jdbc.Driver");
//    }

    @Override
    public String getTopic() {
        basicDaoImpl.getConnection();
        String query = ("SELECT * FROM topic");
        TopicModelImpl topic = new TopicModelImpl();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = basicDaoImpl.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                topic.setName(resultSet.getString("name"));
                topic.setDescription(resultSet.getString("description"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ignore) {
                }
                if (statement != null)
                    try {
                        statement.close();
                    } catch (SQLException ignore) {
                    }
                if (connection != null)
                    try {
                        connection.close();
                    } catch (SQLException ignore) {
                    }
            }
        }
        return topic.getDescription() + " " + topic.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
