<template>
  <div id = "test23">
    千米 : <input type = "text" v-model = "kilometers">
    米 : <input type = "text" v-model = "meters">
    <p id="info"></p>
  </div>
</template>

<script>
    export default {
      data(){
        return{
          kilometers : 0,
          meters:0
        }
      },
      methods: {
      },
      computed :{
      },
      watch : {
        kilometers:function (nval) {
          this.kilometers = nval;
          this.meters = nval * 1000;
          },
        meters : function (val) {
          this.kilometers = val/ 1000;
          this.meters = val;
        }
      }
    }
</script>

<style scoped>

</style>
