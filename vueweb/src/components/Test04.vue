<template>
  <div id="test04">
    {{5+5}}<br>
    {{ ok ? 'YES' : 'NO' }}<br>
    {{ message.split('').reverse().join('') }}
    <div v-bind:id="'list-' + id">菜鸟教程</div>
  </div>
</template>
<script type="text/javascript">
  export default {
    data(){
      return {
        ok: true,
        message: 'RUNOOB',
        id: 1
      }
    }
  };
</script>
