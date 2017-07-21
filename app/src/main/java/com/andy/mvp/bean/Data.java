package com.andy.mvp.bean;

import java.util.List;

/**
 * 类描述：
 * 创建人：yekh
 * 创建时间：2017/7/21 14:59
 */
public class Data {

    /**
     * size : 10
     * list : [{"imgurl":"http://cms-bucket.nosdn.127.net/68efb404840745e4a162e40ea289c7ee20170721134409.jpeg","has_content":true,"docurl":"http://war.163.com/17/0721/13/CPSF6253000181KT.html","id":17569,"time":"2017-07-21 13:44:17","title":"俄历史学家:俄与欧洲应站在一起抵抗纳粹主义复兴","channelname":"war"},{"imgurl":"http://cms-bucket.nosdn.127.net/catchpic/5/57/575327773ff57bf46485eaf58b97a131.jpg","has_content":true,"docurl":"http://war.163.com/17/0721/13/CPSDIGJE000181KT.html","id":17570,"time":"2017-07-21 13:16:08","title":"法国新三军参谋长上任 \u201c最高军政危机\u201d落定？","channelname":"war"},{"imgurl":"http://cms-bucket.nosdn.127.net/a066215354824997b9cbf029da28ad7d20170721131310.png","has_content":true,"docurl":"http://war.163.com/17/0721/13/CPSDFKLV000181KT.html","id":17566,"time":"2017-07-21 13:14:34","title":"普京遭遇中国旅游团围堵 狂热粉丝尖叫拍照","channelname":"war"},{"imgurl":"http://cms-bucket.nosdn.127.net/0435122dece44805905718c75b45a58320170721125020.jpeg","has_content":true,"docurl":"http://war.163.com/17/0721/12/CPSC4M0M000181KT.html","id":17567,"time":"2017-07-21 12:51:06","title":"\u201c小俄罗斯\u201d折射解决乌克兰危机之艰难","channelname":"war"},{"imgurl":"http://cms-bucket.nosdn.127.net/2a85ab43fb8a43f9908d849454571ac220170721123221.png","has_content":true,"docurl":"http://war.163.com/17/0721/12/CPSB5FO6000181KT.html","id":17568,"time":"2017-07-21 12:34:04","title":"胡锡进:与解放军对峙的印军每天有十来个士兵生病","channelname":"war"},{"imgurl":"http://cms-bucket.nosdn.127.net/catchpic/3/37/3779de9b45e89dda75b27d9d01682f0d.jpg","has_content":true,"docurl":"http://war.163.com/17/0721/11/CPS8LGTB000181KT.html","id":17556,"time":"2017-07-21 11:50:24","title":"伊军抓获的IS战俘：16岁德少女 去年离家到叙利亚","channelname":"war"},{"imgurl":"http://cms-bucket.nosdn.127.net/catchpic/1/1f/1ff22e86acc22f0df1a5162cf64a2b44.jpg","has_content":true,"docurl":"http://war.163.com/17/0721/11/CPS8B8OP000181KT.html","id":17557,"time":"2017-07-21 11:44:48","title":"俄军\u201c苏沃洛夫突击\u201d比赛代表队抵达新疆","channelname":"war"},{"imgurl":"http://cms-bucket.nosdn.127.net/79775734d9384e199f2d4cc6b2fe84b920170721113706.jpeg","has_content":true,"docurl":"http://war.163.com/17/0721/11/CPS7VBA0000181KT.html","id":17558,"time":"2017-07-21 11:38:17","title":"外媒：伊朗外交部就科威特驱逐其外交官提出抗议","channelname":"war"},{"imgurl":"http://cms-bucket.nosdn.127.net/6f58a9a7bfa549b098978c5a9fae8c8920170721113541.jpeg","has_content":true,"docurl":"http://war.163.com/17/0721/11/CPS7R9U1000181KT.html","id":17474,"time":"2017-07-21 11:36:05","title":"韩媒:朝韩军事会谈化为泡影 韩敦促朝鲜早日回应","channelname":"war"},{"imgurl":"http://cms-bucket.nosdn.127.net/catchpic/2/26/26309f8ea4ffb314d434771515af8baf.jpg","has_content":true,"docurl":"http://war.163.com/17/0721/11/CPS7C5QD000181KT.html","id":17497,"time":"2017-07-21 11:27:49","title":"伊朗外长：绝无可能重新谈判伊朗核问题全面协议","channelname":"war"}]
     */

    private int size;
    private List<ListBean> list;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * imgurl : http://cms-bucket.nosdn.127.net/68efb404840745e4a162e40ea289c7ee20170721134409.jpeg
         * has_content : true
         * docurl : http://war.163.com/17/0721/13/CPSF6253000181KT.html
         * id : 17569
         * time : 2017-07-21 13:44:17
         * title : 俄历史学家:俄与欧洲应站在一起抵抗纳粹主义复兴
         * channelname : war
         */

        private String imgurl;
        private boolean has_content;
        private String docurl;
        private int id;
        private String time;
        private String title;
        private String channelname;

        public String getImgurl() {
            return imgurl;
        }

        public void setImgurl(String imgurl) {
            this.imgurl = imgurl;
        }

        public boolean isHas_content() {
            return has_content;
        }

        public void setHas_content(boolean has_content) {
            this.has_content = has_content;
        }

        public String getDocurl() {
            return docurl;
        }

        public void setDocurl(String docurl) {
            this.docurl = docurl;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getChannelname() {
            return channelname;
        }

        public void setChannelname(String channelname) {
            this.channelname = channelname;
        }
    }
}
