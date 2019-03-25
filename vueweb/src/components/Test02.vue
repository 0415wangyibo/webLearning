<template>
  <div id="vue_det">
    <h1>site : {{site}}</h1>
    <h1>url : {{url}}</h1>
    <h1>Alexa : {{alexa}}</h1>
    <p v-html="something"></p>
  </div>
</template>
<script type="text/javascript">
  export default {
    data() {
      var data = {site: "菜鸟教程", url: "www.runoob.com", alexa: 10000};
      return {
        site:data.site,
        url:data.url,
        alexa:data.alexa,
        something: "<h1>"+data.site+"</h1>"
      }
    }
  };
</script>
