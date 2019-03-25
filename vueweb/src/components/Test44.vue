<template>
  <div id="test44">
    <input type="button" @click="get()" value="点我异步获取数据(Get)">
    <p id="response"></p>
  </div>
</template>

<script>
    export default {
      name: "test44",
      data(){
       return{
         msg:'Hello World!'
       }
      },
      methods:{
        get:function(){
          $.ajax({
            url: 'http://openapi.youdao.com/api',
            type: 'post',
            dataType: 'jsonp',
            data: {
              q: text,
              appKey: this.appKey,
              salt: this.salt,
              from: this.from,
              to: to,
              sign: md5(this.appKey + text + this.salt + this.key)
            },
            success: function (data) {
              vm.$set(vm.$data, 'translatedText', data.translation[0])
            }
          });
        }
      }
    }
</script>

<style scoped>

</style>
