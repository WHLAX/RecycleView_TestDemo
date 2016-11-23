package com.bwie.recycleview_testdemo.bean;

import java.util.List;

/**
 * Created by ${李泰亲} on 2016/11/19.
 */

public class mDataBean {

    private int status;
    private String info;
    private int times;
    private DataBean data;
    private ExtraBean extra;
    private String ra_referer;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public ExtraBean getExtra() {
        return extra;
    }

    public void setExtra(ExtraBean extra) {
        this.extra = extra;
    }

    public String getRa_referer() {
        return ra_referer;
    }

    public void setRa_referer(String ra_referer) {
        this.ra_referer = ra_referer;
    }

    public static class DataBean {

        private CountsBean counts;
        private List<ForumListBean> forum_list;

        public CountsBean getCounts() {
            return counts;
        }

        public void setCounts(CountsBean counts) {
            this.counts = counts;
        }

        public List<ForumListBean> getForum_list() {
            return forum_list;
        }

        public void setForum_list(List<ForumListBean> forum_list) {
            this.forum_list = forum_list;
        }

        public static class CountsBean {

            private int ask;
            private int company;

            public int getAsk() {
                return ask;
            }

            public void setAsk(int ask) {
                this.ask = ask;
            }

            public int getCompany() {
                return company;
            }

            public void setCompany(int company) {
                this.company = company;
            }
        }

        public static class ForumListBean {

            private int id;
            private String name;
            private List<GroupBean> group;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<GroupBean> getGroup() {
                return group;
            }

            public void setGroup(List<GroupBean> group) {
                this.group = group;
            }

            public static class GroupBean {

                private int id;
                private String name;
                private String description;
                private String total_threads;
                private String photo;
                private List<TypesBean> types;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
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

                public String getTotal_threads() {
                    return total_threads;
                }

                public void setTotal_threads(String total_threads) {
                    this.total_threads = total_threads;
                }

                public String getPhoto() {
                    return photo;
                }

                public void setPhoto(String photo) {
                    this.photo = photo;
                }

                public List<TypesBean> getTypes() {
                    return types;
                }

                public void setTypes(List<TypesBean> types) {
                    this.types = types;
                }

                public static class TypesBean {

                    private int id;
                    private String name;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }
            }
        }
    }

    public static class ExtraBean {

        private int ra_switch;

        public int getRa_switch() {
            return ra_switch;
        }

        public void setRa_switch(int ra_switch) {
            this.ra_switch = ra_switch;
        }
    }
}
