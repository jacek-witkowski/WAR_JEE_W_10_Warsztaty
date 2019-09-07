package pl.coderslab.model;

import pl.coderslab.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SolutionDao {

    private static final String SELECT_LIMITED_QUERY = "SELECT * FROM solution ORDER BY created DESC LIMIT ?";

    public List<Solution> findRecent(int limit) {
        List<Solution> resultList = new ArrayList<>();
        try {
            Connection connection = DbUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_LIMITED_QUERY);
            preparedStatement.setInt(1, limit);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Date created = resultSet.getDate("created");
                String description = resultSet.getString("description");
                Solution solution = new Solution();
                solution.setCreated(created);
                solution.setDescription(description);
                resultList.add(solution);
            }
        } catch (SQLException e ) {
            e.printStackTrace();
        }
        return resultList;
    }

}
