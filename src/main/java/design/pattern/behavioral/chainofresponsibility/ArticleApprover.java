package design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang.StringUtils;

public class ArticleApprover extends Approver{
    @Override
    public void deploy(Course course) {
        if(StringUtils.isNotBlank(course.getArticle())) {
            System.out.println(course.getName() + "含有手记，批准");
            if(approver != null){
                approver.deploy(course); //下一个
            }
        }else {
            System.out.println(course.getName() + "不包含手记，不批准，流程结束。");
            return;
        }
    }
}
