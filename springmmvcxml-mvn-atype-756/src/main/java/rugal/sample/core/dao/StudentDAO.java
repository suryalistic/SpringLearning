package rugal.sample.core.dao;

import ga.rugal.sample.core.entity.Student;
import ml.rugal.sshcommon.hibernate.Updater;
import ml.rugal.sshcommon.page.Pagination;

/**
 *
 * @author Rugal Bernstein
 */
public interface StudentDAO
{

    Student delete(Student bean);

    Student get(Integer id);

    Pagination getPage(int pageNo, int pageSize);

    Student save(Student bean);

    Student updateByUpdater(Updater<Student> updater);
}
