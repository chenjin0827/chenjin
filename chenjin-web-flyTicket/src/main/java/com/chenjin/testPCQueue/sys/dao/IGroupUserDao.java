package com.chenjin.testPCQueue.sys.dao;

import com.chenjin.testPCQueue.common.entity.DataGrid;
import com.chenjin.testPCQueue.common.entity.PageRequest;
import com.chenjin.testPCQueue.common.framework.dao.IBaseDao;
import com.chenjin.testPCQueue.sys.entity.Group;
import com.chenjin.testPCQueue.sys.entity.GroupUser;
import com.chenjin.testPCQueue.sys.entity.User;

import java.util.List;
import java.util.Map;

public abstract interface IGroupUserDao extends IBaseDao<GroupUser, Long>
{
    public abstract DataGrid<GroupUser> queryByDept(PageRequest paramPageRequest, Group paramGroup);

    public abstract List<Map<String, Object>> getIndexTree(Long paramLong);

    public abstract DataGrid<Map<String, Object>> groupUserPage(PageRequest paramPageRequest, String paramString1, Long paramLong, String paramString2);

    public abstract List<GroupUser> findByGroup(Long paramLong);

    public abstract List<Map<String, Object>> groupUserPageSelect(Long paramLong);

    public abstract List<GroupUser> findByNeedDel(Long paramLong, User paramUser);

    public abstract GroupUser findByKey(Long paramLong1, Long paramLong2);
}