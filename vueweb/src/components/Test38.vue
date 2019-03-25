<template>
  <div id="test38">
    <select v-model="selected" name="fruit">
      <option value="">选择一个网站</option>
      <option value="www.runoob.com">Runoob</option>
      <option value="www.google.com">Google</option>
    </select>

    <div id="output">
      选择的网站是: {{selected}}
    </div>
  </div>
</template>

<script>
    export default {
      name: "test38",
      data() {
        return{
          selected: ''
        }
      }
    }
</script>

<style scoped>

</style>
