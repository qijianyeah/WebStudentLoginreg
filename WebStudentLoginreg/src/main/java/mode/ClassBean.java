
  package mode;

  import lombok.AllArgsConstructor;
  import lombok.Data;
  import lombok.NoArgsConstructor;

  /**
   * 结果Bean-完成课程信息的收集
   */
  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  public class ClassBean {
   int id;//标识
   String className;//课程名称
  }
